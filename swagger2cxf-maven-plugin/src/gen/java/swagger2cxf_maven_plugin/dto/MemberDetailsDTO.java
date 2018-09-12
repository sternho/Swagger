package swagger2cxf_maven_plugin.dto;

import java.util.ArrayList;
import java.util.List;
import swagger2cxf_maven_plugin.dto.MemberDetailsInnerDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class MemberDetailsDTO extends ArrayList<MemberDetailsInnerDTO> {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberDetailsDTO {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
