import java.util.Random;


public class Student
{
    private static Random mPRNG = new Random();

    private String mName;
    private float  mGrade;

    public Student(String name)
    {
        mName = name;
        mGrade = mPRNG.nextFloat() * 100.0f;
    }

    public float getGrade()
    {
        return mGrade;
    }

    @Override
    public String toString()
    {
        return String.format("%s - %.2f", mName, mGrade);
    }
}
