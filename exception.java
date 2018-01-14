com.vigneshwar.exception

class withexception{

public static void main(String[] args)
{

int i=5;j=0;result;

System.out.println("-----start-----");

try{

result=i/j;

}

catch(ArithmeticException e)
{

System.out.println("---exception handled---");

}

System.out.println(result);

System.out.println("---stop---");

}

