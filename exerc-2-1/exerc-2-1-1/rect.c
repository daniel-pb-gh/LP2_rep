#include<stdlib.h>
#include<stdio.h>

typedef struct rect{
  float xPoint;	// x coordinate of the point that the rectangle starts. 
  float yPoint;	// y coordinate of the point that the rectangle starts. 

  float width;	//rect width
  float height;	// rect height

  // for making rounded edges
  float Rx;
  float Ry;
}rect;

void print(rect* r){
  printf("rect: xPoint = %f, yPoint = %f, width = %f, height = %f, Rx = %f, Ry = %f \n", r->xPoint, r->yPoint, r->width, r->height, r->Rx, r->Ry);
}
