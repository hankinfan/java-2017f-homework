public class home
{
	    public static void main(String[] args) 
	    {
	    	huluwa[] a=new huluwa[7];
	    	a[5]=new huluwa(1,"大娃","红色");
	    	a[3]=new huluwa(2,"二娃","橙色");
	    	a[2]=new huluwa(3,"三娃","黄色");
	    	a[4]=new huluwa(4,"四娃","绿色");
	    	a[1]=new huluwa(5,"五娃","青色");
	    	a[0]=new huluwa(6,"六娃","蓝色");
	    	a[6]=new huluwa(7,"七娃","紫色"); 
	    	huluwa.bubblesort(a);
	    	huluwa.TwoInsertSort(a);
	    }
	    public static class huluwa
	    {
	    	int order;
	    	String name;
	    	String color;
	    	huluwa(int od,String na,String co)
	    	{
	    		this.order=od;
	    		this.name=na;
	    		this.color=co;
	    	}
	    	public static void bubblesort(huluwa[]a)

	    	{
	    		System.out.println("冒泡排序：");
	    		for(int i=0; i< a.length; i++)
	            {
	                for(int j=i; j< a.length; j++)
	                {
	                	if(a[i].order>a[j].order)
	                	{
	                		System.out.print(a[i].name+"："+(i+1)+"->"+(j+1)+",");
	                		huluwa t=a[i];
	                		a[i]=a[j];
	                		a[j]=t;
	                	}
	                }
	            }
	    		System.out.print("\n");
	    		for(int k=0; k< a.length; k++)
	            {
	            	System.out.print(a[k].name+",");
	            }   
            	System.out.print("\n"); 
	    	}
            public static void TwoInsertSort(huluwa[]a)
            {
            	System.out.println("二分排序：");
            	int left,right;
            	huluwa temp;
                int middle,i,j;
                for(i=1;i<7;i++)
                {
                    left = 0;
                    right = i-1;
                    temp = a[i];   
                    
                    while( left <= right)
                    {
                        middle = (left + right)>>1;
                        if(temp.order <a[middle].order)
                            right = middle-1;
                        else                   
                            left = middle+1;    
                    }
                    
                    System.out.print("第" + i + "趟排序：");
                    for( j = i-1;j >=left;j--)
                    {
                    	System.out.print(a[j].name+(j+1)+"->"+(j+2)+",");
                    	a[j+1] = a[j];
                    }
                    System.out.print(temp.name+i+"->"+(left+1)+",");
                    a[left] = temp;
                  }
                System.out.print("\n"); 
                for(int k=0; k< a.length; k++)
	            {
                	System.out.print(a[k].color+","); 
	            }  
              }

	    }
}
