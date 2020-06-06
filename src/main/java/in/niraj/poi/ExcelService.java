package in.niraj.poi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import in.niraj.EmployeeTree;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * created by pc on Jun, 2020
 */
public class ExcelService {

    public void write(List<EmployeeTree> treeList) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        for (int i = 0; i < treeList.size(); i++) {
            EmployeeTree tree = treeList.get(i);
            XSSFSheet sheet = workbook.createSheet("Tree - "+i);
            writeHelp(0, 1, tree, sheet);
            try (FileOutputStream outputStream = new FileOutputStream("poi-generated-file.xlsx")) {
                workbook.write(outputStream);
//            workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void writeHelp(int indent, int rowNum, EmployeeTree tree, XSSFSheet sheet) {
        if (sheet.getRow(rowNum) != null) {
            writeHelp(indent, rowNum + 1, tree, sheet);
        } else {
            Row row = sheet.createRow(rowNum);
            Cell cell = row.createCell(indent);
            cell.setCellValue(tree.getId());
            cell.setCellValue(tree.getCommonName());
            cell.setCellValue(tree.getFirstName());
            for (EmployeeTree child : tree.getChildren()) {
                writeHelp(indent + 1, rowNum + 1, child, sheet);
            }
        }
    }
}
