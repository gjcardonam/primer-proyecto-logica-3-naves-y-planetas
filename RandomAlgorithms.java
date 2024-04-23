public class RandomAlgorithms {

    public int hash1(int key){
        return (key % 100) + 1;
    }

    public int hash2(int key){
        return ((key * 11) % 100) + 1;
    }

    public int hash3(int key){
        return ((key * 31) % 100) + 1;
    }
}
