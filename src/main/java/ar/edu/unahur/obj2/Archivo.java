package ar.edu.unahur.obj2;

public class Archivo implements IElemento {
    private String nombre;
    private String extension;
    private Integer tamanio;

public Archivo(String nombre, String extension, Integer tamanio) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
    }

@Override
public String nombre() {
    return nombre;
}

@Override
public Integer tamanio() {
    return tamanio;
}

@Override
public void mostrar(Integer identacion) {
    System.out.printf("\n" + nombre, extension);
}

@Override
public IElemento archivoMasPesado() {
    return this;
}








}
