package com.prosports.prof1.Patrones.Decorador;

import com.prosports.prof1.Entidades.Merchandising;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class ListaEnExcel extends DecoradorListadoProductos {
    public ListaEnExcel(ListadoProductos listadoProductos) {
        super(listadoProductos);
    }

    @Override
    public Dictionary<String, Object> obtenerListado() {
        Dictionary<String, Object> list = super.obtenerListado();

        Object listaEnExcel = generarListaEnExcel();
        list.put(TipoListado.EXCEL, listaEnExcel);

        return list;
    }

    public Object generarListaEnExcel() {
        List<Merchandising> productos = new ArrayList<>();
        productosRepo.findAll().forEach(productos :: add);

        ByteArrayOutputStream salida = new ByteArrayOutputStream();

        Workbook libroTrabajo = new HSSFWorkbook();
        String nombreHojaCalculo = "Listado de Productos";

        Sheet sheet = libroTrabajo.createSheet(nombreHojaCalculo);



        return null;
    }
}