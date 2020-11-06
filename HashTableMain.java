package Exercises;

class HashTableMain
{
    public static void main(String[] args) throws Exception
    {
        HashTable hashtable = new HashTable();

        hashtable.Remove("123");

        Record rec = new Record();

        rec.SSN = "123";
        rec.Name = "Mike";
        hashtable.Add(rec.SSN, rec);
        rec = (Record)hashtable.get("123");

        System.out.println(rec.toString());

        try
        {
            rec = new Record();
            rec.SSN = "123";
            rec.Name = "Dupe";
            hashtable.Add(rec.SSN, rec);
        }
        catch (Exception ex)
        {
            System.out.format("Exception '%s' adding %s-%s\n",
                    ex.getMessage(), rec.SSN,rec.Name );
        }

        rec = new Record();
        rec.SSN = "234";
        rec.Name = "Steve";
        hashtable.Add(rec.SSN, rec);

        rec = new Record();
        rec.SSN = "345";
        rec.Name = "Lisa";
        hashtable.Add(rec.SSN, rec);

        rec = new Record();
        rec.SSN = "453";
        rec.Name = "Dave";
        hashtable.Add(rec.SSN, rec);

        hashtable.set("453",rec);

        try
        {
            hashtable.set("455", rec);
        }
        catch (Exception ex)
        {
            System.out.format("Exception '%s' setting '455' record\n",
                    ex.getMessage());
        }

        rec = new Record();
        rec.SSN = "321";
        rec.Name = "Collision";
        hashtable.Add(rec.SSN,rec);

        rec = (Record)hashtable.get("321");
        System.out.println(rec.toString());

        System.out.println("Count: " + hashtable.count());

        hashtable.print();
        hashtable.Remove("321");
        System.out.println("Count: " + hashtable.count());
        hashtable.print();
    }
}
