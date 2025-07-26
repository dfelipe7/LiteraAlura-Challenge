package co.edu.unicauca.literaAlura.service;

public interface IDataConvertion {
    <T> T convertData(String json, Class<T> clase);
}
