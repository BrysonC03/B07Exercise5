package exercise5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Parallelogram_test{

  @Test
  void test_perimieter(){
    Point D = new Point(1,0);
    Point E = new Point(16,4);
    Point F = new Point(4,7);

    Parallelogram par = new Parallelogram(D,E,F);
    double expected_perimiter = 2 * (this.A.distance(this.B) + this.A.distance(this.C));
    assertEquals(par.perimiter(), expected_perimiter); 
  }

  @Test
  void test_perimieter_negative(){
    Point D = new Point(-5,0);
    Point E = new Point(16,-2);
    Point F = new Point(4,7);

    Parallelogram par = new Parallelogram(D,E,F);
    double expected_perimiter = 2 * (this.A.distance(this.B) + this.A.distance(this.C));
    assertEquals(par.perimiter(), expected_perimiter); 
  }

  void test_isRectangle_true(){
    Point D = new Point(0,0);
    Point E = new Point(10,0);
    Point F = new Point(7,7);

    Parallelogram par = new Parallelogram(D,E,F);
    boolean flag = true;
    assertEqual(par.isRectangle(), flag);
  }

  @Test
  void test_isRectangle_false(){
    Point D = new Point(0,0);
    Point E = new Point(10,9);
    Point F = new Point(7,7);

    Parallelogram par = new Parallelogram(D,E,F);
    boolean flag = false;
    assertEqual(par.isRectangle(), flag);
  }

  
}
