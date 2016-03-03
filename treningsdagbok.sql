-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`TreningsOkt`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TreningsOkt` (
  `idTreningsOkt` INT NOT NULL,
  `dato` DATE NOT NULL,
  `tidspunkt` TIME NOT NULL,
  `varighet(min)` INT NOT NULL,
  `kommentar` VARCHAR(45) NULL,
  `form` INT NULL,
  `prestasjon` INT NULL,
  PRIMARY KEY (`idTreningsOkt`));


-- -----------------------------------------------------
-- Table `mydb`.`Ovelse`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Ovelse` (
  `idOvelse` INT NOT NULL,
  `navn` VARCHAR(45) NOT NULL,
  `beskrivelse` VARCHAR(45) NULL,
  `set` INT NOT NULL,
  `repetisjoner` INT NOT NULL,
  `belastning` INT NOT NULL,
  `treningsOkt_fk` INT NOT NULL,
  PRIMARY KEY (`idOvelse`, `treningsOkt_fk`),
  INDEX `fk_Ovelse_TreningsOkt1_idx` (`treningsOkt_fk` ASC),
  CONSTRAINT `fk_Ovelse_TreningsOkt1`
    FOREIGN KEY (`treningsOkt_fk`)
    REFERENCES `mydb`.`TreningsOkt` (`idTreningsOkt`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`Utendors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Utendors` (
  `idUtendors` INT NOT NULL,
  `vaertype` VARCHAR(45) NOT NULL,
  `temperatur` INT NOT NULL,
  `ovelse_fk` INT NOT NULL,
  PRIMARY KEY (`idUtendors`, `ovelse_fk`),
  INDEX `fk_Utendors_Ovelse1_idx` (`ovelse_fk` ASC),
  CONSTRAINT `fk_Utendors_Ovelse1`
    FOREIGN KEY (`ovelse_fk`)
    REFERENCES `mydb`.`Ovelse` (`idOvelse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`Innendors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Innendors` (
  `idInnendors` INT NOT NULL,
  `luftKondisjon` VARCHAR(45) NOT NULL,
  `tilskuere` INT NOT NULL,
  `ovelse_fk` INT NOT NULL,
  `paagang` INT NOT NULL,
  PRIMARY KEY (`idInnendors`, `ovelse_fk`),
  INDEX `fk_Innendors_Ovelse1_idx` (`ovelse_fk` ASC),
  CONSTRAINT `fk_Innendors_Ovelse1`
    FOREIGN KEY (`ovelse_fk`)
    REFERENCES `mydb`.`Ovelse` (`idOvelse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`KanErstatte`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`KanErstatte` (
  `Ovelse_idOvelse` INT NOT NULL,
  `Ovelse_idOvelse1` INT NOT NULL,
  PRIMARY KEY (`Ovelse_idOvelse`, `Ovelse_idOvelse1`),
  INDEX `fk_Ovelse_has_Ovelse_Ovelse1_idx` (`Ovelse_idOvelse1` ASC),
  INDEX `fk_Ovelse_has_Ovelse_Ovelse_idx` (`Ovelse_idOvelse` ASC),
  CONSTRAINT `fk_Ovelse_has_Ovelse_Ovelse`
    FOREIGN KEY (`Ovelse_idOvelse`)
    REFERENCES `mydb`.`Ovelse` (`idOvelse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Ovelse_has_Ovelse_Ovelse1`
    FOREIGN KEY (`Ovelse_idOvelse1`)
    REFERENCES `mydb`.`Ovelse` (`idOvelse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Table `mydb`.`Gruppe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Gruppe` (
  `navn` VARCHAR(45) NOT NULL,
  `idGruppe` INT NOT NULL,
  PRIMARY KEY (`idGruppe`));

-- -----------------------------------------------------
-- Table `mydb`.`DelGruppe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`DelGruppe` (
  `idDelGruppe` INT NOT NULL,
  `navn` VARCHAR(45) NOT NULL,
  `idGruppe_fk` INT NOT NULL,
  PRIMARY KEY (`idDelGruppe`, `idGruppe_fk`),
  INDEX `fk_DelGruppe_Gruppe1_idx` (`idGruppe_fk` ASC),
  CONSTRAINT `fk_DelGruppe_Gruppe1`
    FOREIGN KEY (`idGruppe_fk`)
    REFERENCES `mydb`.`Gruppe` (`idGruppe`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);

-- -----------------------------------------------------
-- Table `mydb`.`Utholdenhet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Utholdenhet` (
  `idUtholdenhet` INT NOT NULL,
  `lengde(km)` INT NOT NULL,
  `varighet(min)` INT NOT NULL,
  `ovelse_fk` INT NOT NULL,
  PRIMARY KEY (`idUtholdenhet`, `ovelse_fk`),
  INDEX `fk_Utholdenhet_Ovelse1_idx` (`ovelse_fk` ASC),
  CONSTRAINT `fk_Utholdenhet_Ovelse1`
    FOREIGN KEY (`ovelse_fk`)
    REFERENCES `mydb`.`Ovelse` (`idOvelse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`Styrkemaal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Styrkemaal` (
  `ovelse_fk` INT NOT NULL,
  `maal_set` INT NOT NULL,
  `maal_repetisjoner` INT NOT NULL,
  `maal_belastning` INT NOT NULL,
  `idMaal` INT NOT NULL,
  PRIMARY KEY (`ovelse_fk`, `idMaal`),
  CONSTRAINT `fk_Styrkemaal_Ovelse1`
    FOREIGN KEY (`ovelse_fk`)
    REFERENCES `mydb`.`Ovelse` (`idOvelse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`Utholdenhetmaal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Utholdenhetmaal` (
  `idUtholdenhetmaal` INT NOT NULL,
  `maal_lengde` INT NOT NULL,
  `maal_varighet` INT NOT NULL,
  `utholdenhet_fk` INT NOT NULL,
  PRIMARY KEY (`idUtholdenhetmaal`, `utholdenhet_fk`),
  INDEX `fk_Utholdenhetmaal_Utholdenhet1_idx` (`utholdenhet_fk` ASC),
  CONSTRAINT `fk_Utholdenhetmaal_Utholdenhet1`
    FOREIGN KEY (`utholdenhet_fk`)
    REFERENCES `mydb`.`Utholdenhet` (`idUtholdenhet`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


-- -----------------------------------------------------
-- Table `mydb`.`Gruppe_has_Ovelse`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Gruppe_has_Ovelse` (
  `idDelGruppe` INT NOT NULL,
  `idOvelse` INT NOT NULL,
  PRIMARY KEY (`idDelGruppe`, `idOvelse`),
  INDEX `fk_Gruppe_has_Ovelse_Ovelse1_idx` (`idOvelse` ASC),
  INDEX `fk_Gruppe_has_Ovelse_Gruppe1_idx` (`idDelGruppe` ASC),
  CONSTRAINT `fk_Gruppe_has_Ovelse_Gruppe1`
    FOREIGN KEY (`idDelGruppe`)
    REFERENCES `mydb`.`DelGruppe` (`idDelGruppe`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Gruppe_has_Ovelse_Ovelse1`
    FOREIGN KEY (`idOvelse`)
    REFERENCES `mydb`.`Ovelse` (`idOvelse`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
