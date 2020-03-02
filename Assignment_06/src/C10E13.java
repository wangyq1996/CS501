public class C10E13 {
    public class MyRectangle2D{
        private double x;
        private double y;
        private double width;
        private double height;

        public MyRectangle2D(){
            this.x = 0;
            this.y = 0;
            this.width = 1;
            this.height = 1;
        }

        public MyRectangle2D(double x,double y, double w,double h){
            this.x = x;
            this.y = y;
            this.width = w;
            this.height = h;
        }

        public void setX(double x){this.x = x;}

        public void setY(double y){this.y = y;}

        public void setWidth(double w){this.width = w;}

        public void setHeight(double h){this.height = h;}

        public double getX(){return this.x;}

        public double getY(){return this.y;}

        public double getWidth(){return this.width;}

        public double getHeight(){return this.height;}
    }
}
