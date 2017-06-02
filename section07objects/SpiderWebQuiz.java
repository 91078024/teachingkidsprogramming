package org.teachingkidsprogramming.section07objects;

import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderQuiz;
import org.teachingkidsprogramming.recipes.quizzes.graders.SpiderWebQuizGrader;

public class SpiderWebQuiz extends SpiderQuiz
{
  @Override
  public void question1()
  {
    for (int i = 0; i < number; i++)
    {
      circle();
    }
  }
  public void question2()
  {
  }
  public void circleAround()
  {
    for (int i = 0; i < 3; i++)
    {
      adjust();
      question1();
    }
  }
  public void question3()
  {
  }
  public void grow()
  {
    length = length * 2.5;
  }
  public void question4()
  {
  }
  public void shrink()
  {
    length = length - 9;
  }
  public void question5()
  {
    //      Create and then call a recipe called expand which
    expand();
    //      Increases the current number by 12
  }
  public void expand()
  {
    number = number + 12;
  }
  public static void main(String[] args)
  {
    new SpiderWebQuizGrader().grade(new SpiderWebQuiz());
  }
}
