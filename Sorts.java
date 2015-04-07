import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    for(int i = 0; i<list.length; i++)
    {
      for(int j = 0; j<list.length-i-1; j++)
      if(list[j] > list[j+1])
      {
        int temp = list[j];
        list[j] = list[j+1];
        list[j+1] = temp;
      }
    }
  }

  public void selectionSort(int[] list)
  {
    int flag, temp;
  
  for (int outer = 0; outer < list.length - 1; outer++)
  {
    flag = outer;  
    for(int inner = outer + 1; inner < list.length;
                                               inner++)
    {
      if(list[inner] < list[flag])
      {
        flag = inner;
      }
    }
    temp = list[outer];
    list[outer] = list[flag];
    list[flag] = temp;
  }
  }

  public void insertionSort(int[] list)
  {
    for (int outer = 1; outer < list.length; outer++)
    {
    int position = outer;
    int key = list[position];
    while (position > 0 && list[position - 1] > key)
    {
      list[position] = list[position - 1];
      position--;
    }
    list[position] = key;
    }
  }

  private void merge(int[] a, int first, int mid, int last)
  {
    int [] temp = new int[a.length];
    mid = (first+last)/2;
    int nA = first;
    int nB = mid +1;
    for(int i = first; i<= last; i++)
    {
      if(nA > mid)
      {
        temp[i] = a[nB];
        nB++;
      }
      else if(nB > last)
      {
        temp[i] = a[nA];
        nA++;
      }
      else if(a[nA] > a[nB])
      {
        temp[i] = a[nB];
        nB++;
      }
      else
      {
        temp[i] = a[nA];
        nA++;
      }
    }
    for(int i = first; i<= last; i++)
    {
      a[i] = temp[i];
    }
  }

  public void mergeSort(int[] a, int first, int last)
  {
    int mid = (first+last)/2;
    if(first != last)
    {
      mergeSort(a, first, mid);
      mergeSort(a, mid+1, last); 
    }
    merge(a, first, mid, last);
  }
}
