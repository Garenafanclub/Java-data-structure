package com.StackQueue;

public class DynamicStack extends CustomStack{
     DynamicStack()
     {
         super();
     }
     DynamicStack(int size)
     {
         super(size);    // it will call parent method constructor of single parameter...
     }

    @Override
    public boolean push(int value) throws Exception {
        int[] extend = new int[this.data.length * 2];
        System.arraycopy(data, 0, extend, 0, data.length);
        data = extend;

        return super.push(value);
    }
}
