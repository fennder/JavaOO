package atividades.unidade3.genericos;

public class ExemplosGenericos<T> {
	
	T obj;

	public ExemplosGenericos(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void showType()
	{
		System.out.println(obj.getClass().getName());
	}
}