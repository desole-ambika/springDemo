package Starter;



import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FutureExample {
	
	public static void main(String[] args) {
	
		Executor executor = new Executor();
		ThreadPoolExecutor obj = new ThreadPoolExecutor(2, 3, 100, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(), new ThreadPoolExecutor.CallerRunsPolicy());
		executor.setExecutor(obj);
		ArrayList<Beans> beans= new ArrayList<Beans>();
		Beans bean = new Beans();
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		beans.add(new Beans("Sai Prakash", "123321"));
		beans.add(new Beans("NreNamew","212321"));
		beans.add(new Beans("Bakfkldkf","343435345"));
		beans.add(new Beans("FKORKFORKFO","456565421"));
		ArrayList<Future<Beans>> names= new ArrayList<Future<Beans>>();
		for(int i =0 ; i < beans.size() ; i ++)
		{
			System.out.println("Values = "+ beans.get(i).getEmpId() + beans.get(i).getNames());
			//How to make a callableTaskclass ;
			CallableExample callable = new CallableExample();
			callable.setEmpId(beans.get(i).getEmpId());
			callable.setName(beans.get(i).getNames());
			Future<Beans> f= executor.executeTask(callable);
			names.add(f);
	}
		for (Future<Beans> future : names) {
			try {
				future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}