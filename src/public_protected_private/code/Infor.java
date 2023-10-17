package public_protected_private.code;

public class Infor {
private int a;
int b;   // No modifier
protected  int c;
public int d;

public void method(){
    this.a = 1;   // Có thể
    this.b = 2 ;
    this.c = 3;
    this.d = 4;
}
}
