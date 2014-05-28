package negocio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

import models.Candidato;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

@SuppressWarnings("unused")
public class GeradorPDF {
	public void criarDocumento(Candidato c) throws DocumentException, IOException{
		
		Document doc = null;
        FileOutputStream os = null;

    try {
    	LinkedList escolaridade=new LinkedList();
		escolaridade.add("Médio imcompleto");
		escolaridade.add("Médio completo");
		escolaridade.add("Superior imcompleto");
		escolaridade.add("Superior completo");
        //cria o documento tamanho A4, margens de 2,54cm
        doc = new Document(PageSize.A4, 72, 72, 72, 72);

        //cria a stream de saída
        os = new FileOutputStream("pdfMaroto.pdf");

        //associa a stream de saída ao
        PdfWriter.getInstance(doc, os);

        //abre o documento
        doc.open();

        //adiciona o texto ao PDF
        Paragraph p = new Paragraph(c.getNome_candidato(),new Font(FontFamily.COURIER, 20, Font.BOLD));
        doc.add(p);
        p = new Paragraph(" ");
        doc.add(p);
        p = new Paragraph("Dados pessoais ",new Font(FontFamily.COURIER, 15, Font.BOLD));
        doc.add(p);
        p = new Paragraph("Email: "+c.getEmail_candidato());
        doc.add(p);
        p = new Paragraph("Endereço: "+c.getEnd_candidato());
        doc.add(p);
        p = new Paragraph("Telefone:"+c.getTelefone_candidato());
        doc.add(p);
        p = new Paragraph("CP: "+c.getCpf_candidato());
        doc.add(p);
        p = new Paragraph("Data de  nascimento: "+c.getData_nasc_candidato());
        doc.add(p);
        p = new Paragraph(" ");
        doc.add(p);
        p = new Paragraph("Dados profissionais ",new Font(FontFamily.COURIER, 15, Font.BOLD));
        doc.add(p);
        p = new Paragraph("Escolaridade: Ensino "+escolaridade.get(c.getEscolaridade_candidato()).toString());
        doc.add(p);
        p = new Paragraph("Área de atuação: "+c.getArea_atuacao_candidato());
        doc.add(p);
        p = new Paragraph("Apêndices: "+c.getApendices_candidato());
        doc.add(p);
        p = new Paragraph("Experiências profissionais: "+c.getExp_candidato());
        doc.add(p);
        p = new Paragraph("Eu só fiz o algoritmo, essas piadas são de Jefferson",new Font(FontFamily.COURIER, 20, Font.BOLD));
        doc.add(p);
        } finally {
            if (doc != null) {
                //fechamento do documento
                doc.close();
            }
            if (os != null) {
               //fechamento da stream de saída
               os.close();
            }
        }
	}
}
