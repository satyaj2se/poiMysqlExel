if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
    String str = NumberToTextConverter.toText(cell.getNumericCellValue())
}

 // Only need one of these
DataFormatter fmt = new DataFormatter();

// Once per cell
String valueAsSeenInExcel = fmt.formatCellValue(cell);

public static boolean isColumnEmpty(Sheet sheet, int columnIndex, int startRow) {
    for (Row row : sheet) {
        if (row.getRowNum() < startRow) continue;
        Cell cell = row.getCell(columnIndex, Row.RETURN_BLANK_AS_NULL);
        if (cell != null) {
            return false;
        }
    }
    return true;
}
