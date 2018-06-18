package com.prosports.prof1.Views;

import com.prosports.prof1.Patrones.Decorador.TipoListado;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class ExcelView extends AbstractXlsView {
    @Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=\"reporte.xls\"");

        workbook = (Workbook)model.get(TipoListado.EXCEL);
        workbook.createSheet("test");
    }
}
