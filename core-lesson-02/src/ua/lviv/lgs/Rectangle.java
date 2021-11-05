package ua.lviv.lgs;

 public class Rectangle {
	 
	 private int length;
	 private int width;
	 
// ����������� 1 ��� ���������
	    Rectangle() {
	        this.length = 15;
	        this.width = 10;
	    }
// ����������� 2 � �����������
	    Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }
	    
// ������	
	    //������� ��� ���������� �������
	    public int GetArea(int length, int width){
	        int area = length * width;
	        return area;
	    }
	    public int GetPerim(int length, int width){
	        int perimeter = length*2 + width*2;
	        return perimeter;
	    }
	    
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
	    
		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + "]";
		}
	 
	   
}