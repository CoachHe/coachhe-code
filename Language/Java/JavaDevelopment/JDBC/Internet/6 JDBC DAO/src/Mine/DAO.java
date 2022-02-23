package Mine;
import java.util.List;
import charactor.*;

public interface DAO {
	// 增加
	public void add(Hero hero);
	// 更改
	public void update(Hero hero);
	// 删除
	public void delete(int id);
	// 查询
	public Hero get(int id);
	// 分页查询
	public List<Hero> list(int start, int count);
}

// 在这里设定了DAO接口，当别的类继承这个接口的时候，里面的方法都需要重写