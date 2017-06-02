package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an adverb");
    String currentEdVerb = MessageBox.askForTextInput("Enter an verb ending in -ed");
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part");
    String currentStory = "Today "; // model
    currentStory = currentStory + "I woke " + currentAdverb + ". "; // controller ?
    currentStory = currentStory + "Then I " + currentEdVerb + " ";
    currentStory = currentStory + "my " + currentBodyPart + ". ";
    MessageBox.showMessage(currentStory); // view
  }
}