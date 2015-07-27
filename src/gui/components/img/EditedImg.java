// PEMS (Police Evidence Management System) Version 0.1
// Copyright 2015 - Jacob Jones and Andrew Rottier
// EditedImg.java

package gui.components.img;
import java.awt.image.*;
import java.util.*;
import org.imgscalr.*;
import exceptions.*;
 
public class EditedImg extends Img
{
	
	private Stack<BufferedImage> currentHistorySequence;
	private Stack<BufferedImage> undoneHistorySequence;
	private boolean saved;

	public EditedImg(String filePath) throws InvalidImgException 
	{
		super(filePath);
		this.currentHistorySequence = new Stack<BufferedImage>();
		this.undoneHistorySequence = new Stack<BufferedImage>();
		this.saved = true;
		this.currentHistorySequence.push(super.getImage());
	}
	
	/* getSaved - returns "saved", a boolean value indicating whether or not the image has been saved since the most recent change
	 */
	public boolean getSaved()
	{
		return this.saved;
	}
	
	/* undo - undoes the most recent change to the image by popping a value from "currentHistorySequence" and pushing it to "undoneHistorySequence"
	 */
	public void undo()
	{
		if (this.currentHistorySequence.size() > 1)
		{
			this.undoneHistorySequence.push(this.currentHistorySequence.pop());
			this.saved = false;
			super.setImage(this.currentHistorySequence.peek());
			super.refreshIcon();
		}
	}
	
	/* redo - redoes the most recently undone action by popping a value from "undoneHistorySequence" and pushing it to "currentHistorySequence"
	 */
	public void redo()
	{
		if (this.undoneHistorySequence.size() > 0)
		{
			this.currentHistorySequence.push(this.undoneHistorySequence.pop());
			this.saved = false;
			super.setImage(this.currentHistorySequence.peek());
			super.refreshIcon();
		}
	}
	
	/* resizeImage - resizes "image" to the specified size using the ULTRA_QUALITY setting
	 *        size - the new size of the image
	 */
	public void resizeImage(int size)
	{
		super.resizeImage(Scalr.Method.ULTRA_QUALITY, size);
	}
	
	/* resizeImage - resizes "image" to the specified width and height using the ULTRA_QUALITY setting
	 *       width - the new width of the image
	 *      height - the new height of the image
	 */
	public void resizeImage(int width, int height)
	{
		super.resizeImage(Scalr.Method.ULTRA_QUALITY, width, height);
	}
	
	/* refreshIcon - calls the parent version of this method, clears "undoneHistorySequence", adds to "currentHistorySequence", and sets "saved" to false
	 */
	protected void refreshIcon()
	{
		super.refreshIcon();
		this.undoneHistorySequence.clear();
		this.currentHistorySequence.push(super.getImage());
		this.saved = false;
	}

}