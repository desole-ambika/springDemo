package Starter;


import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Executor {
	
	private ThreadPoolExecutor executor;

	public ThreadPoolExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(ThreadPoolExecutor executor) {
		this.executor = executor;
	}
	
	//submitting the request
	public <T> Future<T> executeTask(Callable <T> task){
		Future<T> future= this.executor.submit(task);
		return future;
	}
}
