package com.miapp;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Crear un diseño simple del informe
            JasperDesign jasperDesign = new JasperDesign();
            jasperDesign.setName("SimpleReport");
            jasperDesign.setPageWidth(595);  // A4 ancho
            jasperDesign.setPageHeight(842); // A4 alto

            // 2. Agregar un campo estático al informe
            JRDesignBand band = new JRDesignBand();
            band.setHeight(50);
            JRDesignStaticText staticText = new JRDesignStaticText();
            staticText.setX(100);
            staticText.setY(10);
            staticText.setWidth(400);
            staticText.setHeight(30);
            staticText.setText("¡Hola desde JasperReports!");
            staticText.setFontSize(20f);
            band.addElement(staticText);
            jasperDesign.setTitle(band);

            // 3. Compilar el informe
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // 4. Llenar el informe con datos vacíos
            Map<String, Object> parameters = new HashMap<>();
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            // 5. Exportar el informe a PDF
            JRPdfExporter exporter = new JRPdfExporter();
            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput("Reporte.pdf"));
            SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
            exporter.setConfiguration(configuration);
            exporter.exportReport();

            System.out.println("¡Informe generado con éxito!");

        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
