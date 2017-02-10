public class IntArrayBag
{
  int [] data;
  int numberItems;

  public IntArrayBag()
  {
    numberItems = 0;
    data = new int[10];
  }

  public IntArrayBag(int initialSize)
  {
    if (initialSize < 0)
      throw new IllegalArgumentException
        ("The initialSize is negative: " + initialSize);
    data = new int[initialSize];
    numberItems = 0;
  }

  public void ensureSize(int minimumSize)
  {
    int biggerArray[];

    if (data.length < minimumSize) {
      biggerArray = new int[minimumSize];
      System.arraycopy(data, 0, biggerArray, 0, numberItems);
      data = biggerArray;
    }
  }

  public void print() {
      for (int i : data) {
          System.out.format("%d ", i);
      }
      System.out.println();
  }

  public void add(int element) {
      System.out.println(numberItems);
      data[numberItems] = element;
      numberItems++;
      print();

  }

  public void addAll(IntArrayBag addend) {

  }

  public int countOccurances(int target) {
      return 1;
  }

  public boolean remove(int target) {
      return true;
  }

  public int size() {
      return 1;
  }



    public static void main(String [] args) {
        IntArrayBag data1 = new IntArrayBag();
        IntArrayBag data2 = new IntArrayBag();
        data1.add(1);
        data1.add(2);
        data1.add(3);
        data1.add(3);
        // data1.add(9);
        // data1.remove(2);
        // data1.remove(2);
        // data1.add(3);
        // System.out.println("contents of bag data1");
        // System.out.println("size: " + data1.size());
        // System.out.println("number of 1s: " + data1.countOccurrences(1));
        // System.out.println("number of 2s: " + data1.countOccurrences(2));
        // System.out.println("number of 3s: " + data1.countOccurrences(3));
        // System.out.println("number of 4s: " + data1.countOccurrences(4));
        // data2.add(1);
        // data2.add(2);
        // data2.add(1);
        // data2.add(3);
        //
        // System.out.println("contents of bag data2");
        // System.out.println("size: " + data2.size());
        // System.out.println("number of 1s: " + data2.countOccurrences(1));
        // System.out.println("number of 2s: " + data2.countOccurrences(2));
        // System.out.println("number of 3s: " + data2.countOccurrences(3));
        // System.out.println("number of 4s: " + data2.countOccurrences(4));
        // data1.addAll(data2);
        // System.out.println("contents of bag data1 after adding bag data2");
        // System.out.println("size: " + data1.size());
        // System.out.println("number of 1s: " + data1.countOccurrences(1));
        // System.out.println("number of 2s: " + data1.countOccurrences(2));
        // System.out.println("number of 3s: " + data1.countOccurrences(3));
        // System.out.println("number of 4s: " + data1.countOccurrences(4));
    }
}
