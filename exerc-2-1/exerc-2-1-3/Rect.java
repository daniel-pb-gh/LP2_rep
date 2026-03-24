class Rect {
    int x, y;
    int w, h;
    
    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    int area(){
     int base = ((this.x) - (this.w));
     int auxHeight = ((this.y) - (this.h));
     return (base * auxHeight); 
    }
}
