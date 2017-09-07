/*
Программа генерирует случайные фразы из массивов строк
*/
class PairArrays{
  public static void main(String[] args) {

    String []j1= {"Папа", "Мама", "Бабушка"};
    String []j2= {"моет", "протирает", "чистит"};
    String []j3= {"машину", "полку", "одежду"};

    int i1 = (int)(Math.random()*3);
    int i2 = (int)(Math.random()*3);
    int i3 = (int)(Math.random()*3);

    System.out.println(j1[i1]+" "+j2[i2]+" "+j3[i3]+". ");
  }
}
