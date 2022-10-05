package xd;

public interface IPunto {
 public void mover(double a, double b);
 public void mover(IPunto a);
 public void borrar ();
 double getX();
 double getY();
 void setX (double a);
 void setY (double a);

}
