public class circle{
  float radius;
  float eccentricity;

  float Xinit; //x coordinate of the initial point.
  float Yinit; //y coordinate of the initial point.

  float Xend; //x coordinate of the final point.
  float Yend; //y coordinate of the final point.

  circle(){}

  circle (float Xinit, float Yinit){
    this.Xinit = Xinit;
    this.Yinit = Yinit;
    this.Xend = Xend;
    this.Yend = Yend;
  }

  void print(){
    System.out.printf("Circle: Xinit = %f, Yinit = %f, Xend = %f, Yend = %f \n", this.Xinit, this.Yinit, this.Xend, this.Yend);
  }
}

