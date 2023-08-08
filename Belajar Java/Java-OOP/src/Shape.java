class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4; // overriding class shape
    }

    int getParentCorner(){
        return super.getCorner(); // super keyword untuk mengambil dari class parent
    }
}
