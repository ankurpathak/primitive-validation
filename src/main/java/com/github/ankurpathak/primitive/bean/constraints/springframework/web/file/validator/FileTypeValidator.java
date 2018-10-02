package com.github.ankurpathak.primitive.bean.constraints.springframework.web.file.validator;

import com.github.ankurpathak.primitive.bean.constraints.springframework.web.file.FileType;
import com.github.ankurpathak.primitive.bean.constraints.util.ArrayUtils;
import org.apache.tika.Tika;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class FileTypeValidator implements ConstraintValidator<FileType, MultipartFile> {
   private FileType config;
   public void initialize(FileType config) {
      this.config = config;
   }

   public boolean isValid(MultipartFile file, ConstraintValidatorContext context) {
      if(file == null)
         return config.ignoreNull();
      String fileName = file.getOriginalFilename();
      Tika tika = new Tika();
      String mimeType = tika.detect(fileName);
      return ArrayUtils.isNotEmpty(config.mimes()) && Arrays.asList(config.mimes()).contains(mimeType);

   }
}
