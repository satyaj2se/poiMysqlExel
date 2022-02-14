if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
    String str = NumberToTextConverter.toText(cell.getNumericCellValue())
}

 // Only need one of these
DataFormatter fmt = new DataFormatter();

// Once per cell
String valueAsSeenInExcel = fmt.formatCellValue(cell);
