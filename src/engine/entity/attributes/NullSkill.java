package engine.entity.attributes;

public class NullSkill extends Skill {
	public NullSkill() {
		super(-1, "", "", "", 0, 0.0, 0.0, 0.0, 0.0, 0, false, 0, false);
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Override
	public String display() {
		return "";
	}
}