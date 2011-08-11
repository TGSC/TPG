PFont font;
//PImage currentimage;
import ddf.minim.*;
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
   void setup() {
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
     BBMG.resize(screen.width, screen.height);
     size(screen.width, screen.height);
     background(255);
     smooth();
     stroke(0, 102);
     fill(0);
     //rect(x, y, w, h);
     
     
     
     }
   void draw() {
     if (MainMenu == true)
     {
     background(BBMG);
     text("Turned Based Game", screen.width / 2, 290);
     //image(PixButton, 280, 400);
     text("Play", screen.width / 2, 460);
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
     
void stop(){
  // always close Minim audio classes when you are done with them
  player.close();
  hover.close();
  click.close();
  minim.stop();
  
  super.stop();
  }
