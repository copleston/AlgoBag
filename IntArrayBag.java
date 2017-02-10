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

  public void add(int element)

  public void addAll(IntArrayBag addend)

  public int countOccurances(int target)

  public boolean remove(int target)
  
  public int size()

}
