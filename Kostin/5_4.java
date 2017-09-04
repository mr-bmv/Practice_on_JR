class DayInSec{
  public static void main(String[] args) {
    int a = (int)(Math.random()*28800);

    System.out.println("Часы показывают: "+ a);

    for (int i = 8; i >= 1; i--){
      if ( a >=0 && a < 60*60  && i == 1) {
        System.out.println("Осталось работать менее часа");
      } else if ( a <= 60 * 60 * i && a > 60 * 60 * (i-1)){
        System.out.println("Осталось работатьть более "+(i-1)+" часов");
      }
    }
  }
}
