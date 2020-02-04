package daos.v2;

import entities.ToDo;
import entities.ToDoDto;
import io.reactivex.Observable;

import java.util.List;
import java.util.Optional;

public interface ToDoDao {
    Observable<ToDo> create(ToDoDto dto);
    Observable<Optional<ToDo>> read(String id);
    Observable<List<ToDo>> readAll();
    Observable<Optional<ToDo>> update(ToDo toDo);
    Observable<Boolean> delete(String id);
}
