package io.tech.SpringHostApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Model{
    public String name;
    public String language;
    public String id;
    public String bio;
    public double version;
}