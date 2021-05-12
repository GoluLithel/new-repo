

public class GridCell {
	private boolean activeCell;
	private boolean isBishopCanVisit;
	private boolean isHorseCanVisit;
	
	
	
	public GridCell() {
		super();
		// TODO Auto-generated constructor stub
		this.activeCell = false;
		this.isBishopCanVisit = false;
		this.isHorseCanVisit = false;
	}

	public GridCell(boolean activeCell, boolean isBishopCanVisit, boolean isHorseCanVisit) {
		super();
		this.activeCell = activeCell;
		this.isBishopCanVisit = isBishopCanVisit;
		this.isHorseCanVisit = isHorseCanVisit;
	}

	public boolean isActiveCell() {
		return activeCell;
	}

	public void setActiveCell(boolean activeCell) {
		this.activeCell = activeCell;
	}

	public boolean isBishopCanVisit() {
		return isBishopCanVisit;
	}

	public void setBishopCanVisit(boolean isBishopCanVisit) {
		this.isBishopCanVisit = isBishopCanVisit;
	}

	public boolean isHorseCanVisit() {
		return isHorseCanVisit;
	}

	public void setHorseCanVisit(boolean isHorseCanVisit) {
		this.isHorseCanVisit = isHorseCanVisit;
	}
	
	
}
