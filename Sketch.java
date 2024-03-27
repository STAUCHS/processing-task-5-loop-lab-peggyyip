import processing.core.PApplet;
/**
 * Processing Task #5 - Generating code with 8 different designs in 8 different boxes/quadrants
 * @author: P. Yip 
 *
 */
public class Sketch extends PApplet {
  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(159, 206, 214);
  }

  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
  }
  public void draw_section_outlines() {
    
    // Draw outline of squares (base)
    stroke(6);
    noFill();

    // Draw bottom row boxes
    rect(0, 300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // Draw top row boxes
    rect(0, 0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  public void draw_section1() {
    // Quadrant 1
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + intRow * 10; 
        intY = 300 + 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section2() {
    // Quadrant 2 
    int intX = 0;
    int intY = 0;

    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 300 + intRow * 10; 
        intY = 300 + 3 + intColumn * 10; 
      
    if (intRow % 2 == 1) {
      fill(0);
    }   
    else {
      fill(255);
    }

    noStroke();
    rect(intX, intY, 5, 5);
    }
  }
}

  public void draw_section3() {
    // Quadrant 3
    int intX = 0;
    int intY = 0;
      
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
      intX = 3 + 600 + intRow * 10; 
      intY = 300 + 3 + intColumn * 10; 
      
      if (intColumn % 2 == 0) {
        fill(0);
      } 
      else {
        fill(255);
      }
        
      noStroke();
      rect(intX, intY, 5, 5);
    }
  }
}

  public void draw_section4() {
    // Quadrant 4
    int intX = 0;
    int intY = 0;
    
    for (int intRow = 0; intRow < 30; intRow++) {
      for (int intColumn = 0; intColumn < 30; intColumn++) {
        intX = 3 + 900 + intRow * 10; 
        intY = 300 + 3 + intColumn * 10; 

        fill(255);
        if (intColumn % 2 == 0 || intRow % 2 == 1) {
          fill(0);
        } 
        
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section5() {
    // Quadrant 5
    int intX = 0;
    int intY = 0;
    int intMaximum = 0;

    for (int intRow = 29; intRow >= 1; intRow--) {
      intMaximum ++;
      for (int intColumn = 30; intColumn >= intMaximum; intColumn--) {
        intX = 3 + intRow * 10; 
        intY = 3 + intColumn*  10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section6() {
    // Quadrant 6
    int intX = 0;
    int intY = 0;
    int intMaximum = -1;

    for (int intRow = 0; intRow <= 30; intRow++) {
      intMaximum ++;
      for (int intColumn = 29; intColumn >= intMaximum; intColumn--) {
        intX = 300 + intRow * 10; 
        intY = 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section7() {
    // Quadrant 7
    int intX = 0;
    int intY = 0;
    int intMaximum = 30;

    for (int intRow = 0; intRow <= 30; intRow++) {
      intMaximum --;
      for (int intColumn = 0; intColumn <= intMaximum; intColumn++) {
        intX = 600 + 3 + intRow * 10; 
        intY = 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8() {
    // Quadrant 8
    int intX = 0;
    int intY = 0;
    int intMaximum = 31;

    for (int intRow = 30; intRow >= 0; intRow--) {
      intMaximum --;
      for (int intColumn = 0; intColumn <= intMaximum; intColumn++) {
        intX = 900 + 3 + intRow * 10; 
        intY = 3 + intColumn * 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    } 
  }
}      
  