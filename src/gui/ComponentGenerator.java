// PEMS (Police Evidence Management System) Version 0.1
// Copyright 2015 - Jacob Jones and Andrew Rottier
// ComponentGenerator.java

package gui;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

import javax.swing.*;

public class ComponentGenerator 
{
	
	public static final Font TITLE_FONT = new Font("Courier New", Font.BOLD, 30);
	public static final Font SUBTITLE_FONT = new Font("Courier New", Font.BOLD, 22);
	public static final Font STANDARD_TEXT_FONT = new Font("Georgia", Font.PLAIN, 16);
	public static final Font ERROR_TEXT_FONT = new Font("Georgia", Font.ITALIC, 12);
	public static final Color TITLE_COLOR = new Color(46, 46, 46);
	public static final Color SUBTITLE_COLOR = new Color(2, 2, 123);
	public static final Color STANDARD_TEXT_COLOR = new Color(44, 29, 29);
	public static final Color ERROR_TEXT_COLOR = new Color(202, 12, 12);
	
	public ComponentGenerator()
	{
		
	}
	
	/* generateButton - creates and returns a JButton that complies with the parameters
	 *           text - the text displayed in the button
	 *         action - the action to execute when the button is pressed
	 */
	public static JButton generateButton(String text, ActionListener action)
	{
		JButton newButton = new JButton(text);
		newButton.addActionListener(action);
		return newButton;
	}
	
	/* generateButton - creates and returns a JButton that complies with the parameters
	 *           text - the text displayed in the button
	 *         action - the action to execute when the button is pressed
	 *     alignmentX - the horizontal alignment of the button
	 */
	public static JButton generateButton(String text, ActionListener action, float alignmentX)
	{
		JButton newButton = new JButton(text);
		newButton.addActionListener(action);
		newButton.setAlignmentX(alignmentX);
		return newButton;
	}
	
	/* generateButton - creates and returns a JButton that complies with the parameters
	 *           text - the text displayed in the button
	 *         action - the action to execute when the button is pressed
	 *     alignmentX - the horizontal alignment of the button
	 *     alignmentY - the vertical alignment of the button
	 */
	public static JButton generateButton(String text, ActionListener action, float alignmentX, float alignmentY)
	{
		JButton newButton = new JButton(text);
		newButton.addActionListener(action);
		newButton.setAlignmentX(alignmentX);
		newButton.setAlignmentY(alignmentY);
		return newButton;
	}
	
	/* generateLabel - creates and returns a JLabel that complies with the parameters
	 *         image - the image displayed in the label
	 */
	public static JLabel generateLabel(BufferedImage image)
	{
		JLabel newLabel = new JLabel(new ImageIcon(image));
		return newLabel;
	}
	
	/* generateLabel - creates and returns a JLabel that complies with the parameters
	 *         image - the image displayed in the label
	 *    alignmentX - the horizontal alignment of the label
	 */
	public static JLabel generateLabel(BufferedImage image, float alignmentX)
	{
		JLabel newLabel = new JLabel(new ImageIcon(image));
		newLabel.setAlignmentX(alignmentX);
		return newLabel;
	}
	
	/* generateLabel - creates and returns a JLabel that complies with the parameters
	 *         image - the image displayed in the label
	 *    alignmentX - the horizontal alignment of the label
	 *    alignmentY - the vertical alignment of the label
	 */
	public static JLabel generateLabel(BufferedImage image, float alignmentX, float alignmentY)
	{
		JLabel newLabel = new JLabel(new ImageIcon(image));
		newLabel.setAlignmentX(alignmentX);
		newLabel.setAlignmentY(alignmentY);
		return newLabel;
	}
	
	/* generateLabel - creates and returns a JLabel that complies with the parameters
	 *          text - the text displayed in the label
	 *          font - the font type to use in the label
	 *         color - the font color to use in the label
	 */
	public static JLabel generateLabel(String text, Font font, Color color)
	{
		JLabel newLabel = new JLabel(text);
		newLabel.setFont(font);
		newLabel.setForeground(color);
		return newLabel;
	}
	
	/* generateLabel - creates and returns a JLabel that complies with the parameters
	 *          text - the text displayed in the label
	 *          font - the font type to use in the label
	 *         color - the font color to use in the label
	 *    alignmentX - the horizontal alignment of the label
	 */
	public static JLabel generateLabel(String text, Font font, Color color, float alignmentX)
	{
		JLabel newLabel = new JLabel(text);
		newLabel.setFont(font);
		newLabel.setForeground(color);
		newLabel.setAlignmentX(alignmentX);
		return newLabel;
	}
	
	/* generateLabel - creates and returns a JLabel that complies with the parameters
	 *          text - the text displayed in the label
	 *          font - the font type to use in the label
	 *         color - the font color to use in the label
	 *    alignmentX - the horizontal alignment of the label
	 *    alignmentY - the vertical alignment of the label
	 */
	public static JLabel generateLabel(String text, Font font, Color color, float alignmentX, float alignmentY)
	{
		JLabel newLabel = new JLabel(text);
		newLabel.setFont(font);
		newLabel.setForeground(color);
		newLabel.setAlignmentX(alignmentX);
		newLabel.setAlignmentY(alignmentY);
		return newLabel;
	}

}
