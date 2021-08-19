package cmr.iut.serveuriut.service;


import java.util.List;
import java.util.Optional;

public interface ICrudService<T, ID> {
    public List<T> findAllT();
    public T addItem(T i) ;
    public Optional<T> findItemById( ID id);
    public void deleteById(ID id) ;
}

