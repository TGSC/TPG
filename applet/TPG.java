import processing.core.*; 
import processing.xml.*; 

import ddf.minim.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class TPG extends PApplet {

PFont font;
//PImage currentimage;

AudioPlayer player;
AudioPlayer click;
AudioPlayer hover;
Minim minim;

PImage BBMG;
PImage PixButton;
//ImageButtons button;
boolean InBattle = false;
boolean MainMenu = true;
boolean Played = false;
boolean Played2 = false;
int timer = millis();
//int timerSec = timer / 1000;
int x = 280;
int y = 400;
int w = 400;
int h = 100; 
   public void setup() {
     //Font
     font = loadFont("Neucha-48.vlw");
     textFont(font);
     textAlign(CENTER);
     //Sound
     minim = new Minim(this);
     player = minim.loadFile("CementMittens.mp3", 2048);
     hover = minim.loadFile("Hover.mp3", 2048);
     click = minim.loadFile("Hover.mp3", 2048);
     //Image
     BBMG = loadImage("Background.png");
     PixButton = loadImage("Button.png");
     //button = new ImageButtons(x, y, w, h, PixButton, PixButton, PixButton);
     //Other
     BBMG.resize(960,640);
     size(960, 640);
     background(255);
     smooth();
     stroke(0, 102);
     fill(0);
     //rect(x, y, w, h);
     
     
     
     }
   public void draw() {
     if (MainMenu == true)
     {
     background(BBMG);
     text("Turned Based Game", 480, 290);
     //image(PixButton, 280, 400);
     text("Play", 480, 460);
     }
     /*if (mousePressed == true){
     if ((mouseX > 280) && (mouseX < 380) &&
         (mouseY > 290) && (mouseY < 690))
          {
            MainMenu = false;
            background(BBMG);
            //click.play();
          }
       } */
   }
     
public void stop(){
  // always close Minim audio classes when you are done with them
  player.close();
  hover.close();
  click.close();
  minim.stop();
  
  super.stop();
  }
  static public void main(String args[]) {
    PApplet.main(new String[] { "--present", "--bgcolor=#666666", "--stop-color=#cccccc", "TPG" });
  }
}
