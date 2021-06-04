package cmr.iut.serveuriut.service;

import java.util.List;
import java.util.Optional;

public interface IcrudService<T,ID>{
    public List<T> findAllT();
    public T AddItem(T t);
    public Optional<T> findItemById(int id);
    public void deleteById(int id);
}
