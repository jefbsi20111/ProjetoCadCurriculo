-- MySQL Script generated by MySQL Workbench
-- 04/26/14 20:29:13
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema ProjetoCadCurriculoDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ProjetoCadCurriculoDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `ProjetoCadCurriculoDB` ;

-- -----------------------------------------------------
-- Table `ProjetoCadCurriculoDB`.`Empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetoCadCurriculoDB`.`Empresa` (
  `idEmpresa` INT NOT NULL AUTO_INCREMENT,
  `cnpj_empresa` VARCHAR(18) NOT NULL,
  `razao_social_empresa` VARCHAR(255) NULL,
  `nome_fantasia_empresa` VARCHAR(255) NOT NULL,
  `email_empresa` VARCHAR(100) NOT NULL,
  `end_empresa` VARCHAR(255) NULL,
  `telefone_empresa` BIGINT(14) NULL,
  `senha_empresa` VARCHAR(16) NOT NULL,
  PRIMARY KEY (`idEmpresa`, `email_empresa`),
  UNIQUE INDEX `idEmpresa_UNIQUE` (`idEmpresa` ASC),
  UNIQUE INDEX `cnpj_UNIQUE` (`cnpj_empresa` ASC),
  UNIQUE INDEX `razao_social_UNIQUE` (`razao_social_empresa` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProjetoCadCurriculoDB`.`Candidato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetoCadCurriculoDB`.`Candidato` (
  `idCandidato` INT NOT NULL,
  `nome_candidato` VARCHAR(255) NULL,
  `email_candidato` VARCHAR(45) NOT NULL,
  `senha_candidato` VARCHAR(45) NOT NULL,
  `cpf_candidato` VARCHAR(16) NULL,
  `telefone_cadiidato` VARCHAR(16) NULL,
  `data_nasc` DATE NULL,
  `escolaridade_candidato` INT NOT NULL,
  `exp_candidato` VARCHAR(500) NULL,
  `area_atuacao_candidato` VARCHAR(500) NULL,
  `apencies_candidato` VARCHAR(500) NULL,
  PRIMARY KEY (`idCandidato`, `email_candidato`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProjetoCadCurriculoDB`.`Vagas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetoCadCurriculoDB`.`Vagas` (
  `idVagas` INT NOT NULL,
  `carga_horaria_vagas` INT NOT NULL,
  `remuneracao_vagas` VARCHAR(45) NOT NULL,
  `requisitos_vagas` VARCHAR(500) NOT NULL,
  `descricao_vagas` VARCHAR(500) NULL,
  `Empresa_idEmpresa` INT NOT NULL,
  `Empresa_email_empresa` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idVagas`, `Empresa_idEmpresa`, `Empresa_email_empresa`),
  INDEX `fk_Vagas_Empresa_idx` (`Empresa_idEmpresa` ASC, `Empresa_email_empresa` ASC),
  CONSTRAINT `fk_Vagas_Empresa`
    FOREIGN KEY (`Empresa_idEmpresa` , `Empresa_email_empresa`)
    REFERENCES `ProjetoCadCurriculoDB`.`Empresa` (`idEmpresa` , `email_empresa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProjetoCadCurriculoDB`.`Vagas_has_Candidato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ProjetoCadCurriculoDB`.`Vagas_has_Candidato` (
  `Vagas_idVagas` INT NOT NULL,
  `Vagas_Empresa_idEmpresa` INT NOT NULL,
  `Vagas_Empresa_email_empresa` VARCHAR(100) NOT NULL,
  `Candidato_idCandidato` INT NOT NULL,
  `Candidato_email_candidato` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Vagas_idVagas`, `Vagas_Empresa_idEmpresa`, `Vagas_Empresa_email_empresa`, `Candidato_idCandidato`, `Candidato_email_candidato`),
  INDEX `fk_Vagas_has_Candidato_Candidato1_idx` (`Candidato_idCandidato` ASC, `Candidato_email_candidato` ASC),
  INDEX `fk_Vagas_has_Candidato_Vagas1_idx` (`Vagas_idVagas` ASC, `Vagas_Empresa_idEmpresa` ASC, `Vagas_Empresa_email_empresa` ASC),
  CONSTRAINT `fk_Vagas_has_Candidato_Vagas1`
    FOREIGN KEY (`Vagas_idVagas` , `Vagas_Empresa_idEmpresa` , `Vagas_Empresa_email_empresa`)
    REFERENCES `ProjetoCadCurriculoDB`.`Vagas` (`idVagas` , `Empresa_idEmpresa` , `Empresa_email_empresa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Vagas_has_Candidato_Candidato1`
    FOREIGN KEY (`Candidato_idCandidato` , `Candidato_email_candidato`)
    REFERENCES `ProjetoCadCurriculoDB`.`Candidato` (`idCandidato` , `email_candidato`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
