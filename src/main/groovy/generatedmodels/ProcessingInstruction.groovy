package generatedmodels

import javax.persistence.Column;
// default package
// Generated Jan 14, 2017 9:37:52 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * ProcessingInstruction generated by hbm2java
 */
@Entity
@Table(name = "processing_instruction")
public class ProcessingInstruction implements java.io.Serializable {

	private int instructionId;
	private int instructionCategoryId;
	private String instructionName;
	private String instructionBody;

	public ProcessingInstruction() {
	}

	public ProcessingInstruction(int instructionId, int instructionCategoryId, String instructionName,
			String instructionBody) {
		this.instructionId = instructionId;
		this.instructionCategoryId = instructionCategoryId;
		this.instructionName = instructionName;
		this.instructionBody = instructionBody;
	}

	@Id

	@Column(name = "instruction_id", unique = true, nullable = false)
	public int getInstructionId() {
		return this.instructionId;
	}

	public void setInstructionId(int instructionId) {
		this.instructionId = instructionId;
	}

	@Column(name = "instruction_category_id", nullable = false)
	public int getInstructionCategoryId() {
		return this.instructionCategoryId;
	}

	public void setInstructionCategoryId(int instructionCategoryId) {
		this.instructionCategoryId = instructionCategoryId;
	}

	@Column(name = "instruction_name", nullable = false)
	public String getInstructionName() {
		return this.instructionName;
	}

	public void setInstructionName(String instructionName) {
		this.instructionName = instructionName;
	}

	@Column(name = "instruction_body", nullable = false)
	public String getInstructionBody() {
		return this.instructionBody;
	}

	public void setInstructionBody(String instructionBody) {
		this.instructionBody = instructionBody;
	}

}