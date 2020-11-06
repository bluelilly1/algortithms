package Exercises;

public class HashTable {
	
		  Object[]        keys;
		  Object[]        values;
		  int    max;

		  public HashTable()
		  {
		    max = 10;
		    keys = new Object[max];
		    values = new Object[max];
		  }

		  public int count()
		  {
		    int count = 0;
		    int i = 0;
		    while (i < max) {
		    	if (keys[i] != null) {
		    		count++;
		    	}
		    	i++;
		    }

		    return count;
		  }

		  public void Add(Object key, Object v) throws Exception
		  {
		    if (key == null)
		    {
		      throw new Exception();
		    }

		    int index = GenerateIndex(key);

		    // Check if there is a collision
		    if (values[index] != null)
		    {
		      while (index < max && keys[index] != null)
		      {
		        if (keys[index].equals(key))
		        {
		          throw new Exception("No dupes allowed");
		        }
		        index++;
		      }

		      if (index >= max)
		      {
		        throw new Exception("Too many keys!");
		      }
		    }

		    keys[index] = key;
		    values[index] = v;
		  }

		  public Object get(Object key)
		  {
		    int index = GenerateIndex(key);

		    while (index < max && keys[index] != null)
		    {
		      if (keys[index].equals(key))
		      {
		        return values[index];
		      }
		      index++;
		    }

		    return null;
		  }

		  public void set(Object key, Object value) throws Exception
		  {
		    int index = GenerateIndex(key);

		    while (index < max && keys[index] != null)
		    {
		      if (keys[index].equals(key))
		      {
		        values[index] = value;
		        return;
		      }
		      index++;
		    }

		    throw new Exception("Key not found!");
		  }

		  public void Remove(Object key)
		  {
		    int index = GenerateIndex(key);

		    while (index < max && keys[index] != null)
		    {
		      if (keys[index].equals(key))
		      {
		    	  keys[index] = null;
		       values[index] = null;
		       break;
		      }
		      index++;
		    }

		    
		  }
		 

		   public void print()
		  {
		    for (int index = 0; index < keys.length; index++)
		    {
		      if (keys[index] != null)
		      {
		        System.out.format("Key=%s Value=%s\n", keys[index], values[index]);
		      }
		    }
		  }

		  // "simple hash function"
		  private int GenerateIndex(Object key)
		  {
		    String str = key.toString();

		    int index = 0;

		    for (int x = 0; x < str.length(); x++)
		    {
		      index += (int)str.charAt(x);
		    }

		    // make the index fit in the array size
		    index = index % max;

		    return index;
		  }
		
}
