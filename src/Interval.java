public class Interval {
    /** fields: the beginning of the interval, end of interval,
     * number of odd numbers, number of even numbers
     */
    public int sinterval , finterval , odd = 0, even = 0;

    /** constructor - creation of a new object */
    Interval(){
        sinterval = 0;
        finterval = 0;
        odd = 0;
        even = 0;
    }
    /** odd number output function */
    public void POdd(){
        for (int i = sinterval; i <= finterval; i++)
            if (i % 2 != 0)
                System.out.print(i + " ");
        System.out.println();
    }
    /** even number output function */
    public void PEven(){
        for (int i = finterval; i >= sinterval; i--)
            if (i % 2 == 0)
                System.out.print(i + " ");
        System.out.println();
    }
     /** function of adding odd numbers
     * @return returns the sum of odd numbers
     */
    public int AddOdd(){
        int add = 0;
        for (int i = sinterval; i <= finterval; ++i)
            if (i % 2 != 0)
                add += i;
        return add;
    }
    /**
     * function of adding even numbers
     * @return returns the sum of even numbers
     */
    public int AddEven(){
        int add = 0;
        for (int i = finterval; i >= sinterval; i--)
            if (i % 2 == 0)
                add += i;
        return add;
    }
    /**
     * Fibonacci series output function
     * @return returns the second number of a series
     */
    public int Fibonacci(int length) {
        int first = sinterval, second = finterval, cache;
        if (finterval % 2 != 0) {
            first = finterval;
            second = finterval - 1;
        }
        else if (finterval % 2 == 0) {
            first = finterval - 1;
            second = finterval;
        }
        for (int i = 0; i < length; ++i) {
            cache = first + second;
            first = second;
            second = cache;
        }
        if (second % 2 != 0)
            odd++;
        else if (second % 2 == 0)
            even++;
        return second;
    }
    /**
     * the function of calculating the percentage of odd numbers
     * @return returns the percentage of odd numbers
     */
    public int rateOdd(int length) {
        return odd * 100 / length;
    }
    /**
     * the function of calculating the percentage of even numbers
     * @return returns the percentage of even numbers
     */
    public int rateEven(int length) {
        return even * 100 / length;
    }
}
