public class BmiService {
    public float calculate (float height, int weight) {
        float result = weight/(height*height/10000);
        return result;
    }
}
